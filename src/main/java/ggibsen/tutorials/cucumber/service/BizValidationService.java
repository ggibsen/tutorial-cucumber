package ggibsen.tutorials.cucumber.service;

import ggibsen.tutorials.cucumber.model.BizPojo;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ggibsen on 7/5/2017.
 */
@Service
public class BizValidationService {

    private static final int VALID_LENGTH = 3;

    public Map<Long, BizPojo> idsToPojos = new HashMap<Long, BizPojo>();

    public void insertBizIdea(BizPojo bizVal) {
        idsToPojos.put(bizVal.getId(), bizVal);
    }

    private BizPojo get(long id) {
        BizPojo pojo = idsToPojos.get(id);
        if (pojo == null) {
            throw new RuntimeException("BizPojo not found for ID " + id);
        }
        return pojo;
    }

    public void verifyExplanation(long id) {
        BizPojo pojo = get(id);
        if (pojo.getBizValue().length() < VALID_LENGTH) {
            throw new RuntimeException("BizPojo not valid explanation for ID " + id);
        }
    }

    public int getNumberIdeas() {
        return idsToPojos.size();
    }

    public List<String> getApprovals(long id) {
        BizPojo pojo = get(id);
        return pojo.getApprovals();
    }

    public void register(BizPojo bizVal) {
        // just a silly implementation
        insertBizIdea(bizVal);
    }

    public List<String> getSponsors(long id) {
        BizPojo pojo = get(id);
        // silly biz logic (reuse of code)
        return pojo.getSponsors();
    }

    public List<String> getCorporateSponsors(long id) {
        BizPojo pojo = get(id);
        // silly biz logic (reuse of code)
        return pojo.getCorporateSponsors();
    }

    public void clear() {
        idsToPojos.clear();
    }
}
