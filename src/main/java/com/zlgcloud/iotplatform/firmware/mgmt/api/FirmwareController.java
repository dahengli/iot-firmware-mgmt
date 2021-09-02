package com.zlgcloud.iotplatform.firmware.mgmt.api;

import com.zlgcloud.iotplatform.firmware.mgmt.interfaces.api.FirmwareApi;
import com.zlgcloud.iotplatform.firmware.mgmt.interfaces.api.model.ApiFirmwareDescResponse;
import com.zlgcloud.iotplatform.firmware.mgmt.interfaces.api.model.ApiFirmwareNotifyRequest;
import com.zlgcloud.iotplatform.firmware.mgmt.interfaces.api.model.ApiFirmwaresQueryRequest;
import com.zlgcloud.iotplatform.firmware.mgmt.interfaces.api.model.ApiFirmwaresQueryResponse;
import com.zlgcloud.iotplatform.firmware.mgmt.service.FirmwareService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@Api(tags = "firmware")
public class FirmwareController implements FirmwareApi {
    @Resource
    private FirmwareService firmwareService;

    @Override
    public ResponseEntity<Void> delete(Long tenantId, String devType, String version, Long firmwareId) {
        return null;
    }

    @Override
    public ResponseEntity<ApiFirmwareDescResponse> getFirmwareDesc(Long tenantId, String devType, String version) {
        return null;
    }


    @Override
    public ResponseEntity<List<ApiFirmwaresQueryResponse>> listFirmware(Long tenantId, ApiFirmwaresQueryRequest body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> notifyUpgrade(Long tenantId, String devType, String version, ApiFirmwareNotifyRequest body) {
        return null;
    }

    @Override
    public ResponseEntity<String> uploadFirmware(Long tenantId, String devType, String version, String versionNum, Integer firmwareType, MultipartFile file) {
//        return  null;
        return  ResponseEntity.ok(firmwareService.uploadFirmware(tenantId,devType,version,versionNum,firmwareType,file));
    }
}
