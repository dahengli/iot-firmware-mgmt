package com.zlgcloud.iotplatform.firmware.mgmt.service;

import com.zlgcloud.iotplatform.common.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
@Service
public class FirmwareService {

    private boolean isValidVersion(String version){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._-]+$");
        Matcher matcher = pattern.matcher(version);
        return matcher.matches();
    }

    public String uploadFirmware(Long tenantId, String devType, String version, String versionNum, Integer firmwareType, MultipartFile file){
        if(file.isEmpty()){
            throw new BizException(HttpStatus.BAD_REQUEST,"firmware.10001");
        }
        if(!isValidVersion(version)){
            throw new BizException(HttpStatus.BAD_REQUEST, "firmware.10002");
        }

        String fileName = file.getOriginalFilename();
        File dest = new File("/share/firmwares/" + fileName);
        if (dest.exists()) {

        }
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }

        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
