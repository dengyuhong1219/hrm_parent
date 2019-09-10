package com.dyh.hrm.client;

import com.dyh.hrm.domain.Systemdictionary;
import com.dyh.hrm.query.SystemdictionaryQuery;
import com.dyh.hrm.util.AjaxResult;
import com.dyh.hrm.util.PageList;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yaohuaipeng
 * @date 2018/10/8-16:18
 */
@Component
public class SystemdictionaryClientHystrixFallbackFactory implements FallbackFactory<SystemdictionaryClient> {

    public SystemdictionaryClient create(Throwable throwable) {
        return new SystemdictionaryClient() {
            public AjaxResult save(Systemdictionary systemdictionary) {
                return null;
            }

            public AjaxResult delete(Integer id) {
                return null;
            }

            public Systemdictionary get(Long id) {
                return null;
            }

            public List<Systemdictionary> list() {
                return null;
            }

            public PageList<Systemdictionary> json(SystemdictionaryQuery query) {
                return null;
            }
        };
    }
}
