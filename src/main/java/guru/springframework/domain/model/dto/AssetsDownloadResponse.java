package guru.springframework.domain.model.dto;


import guru.springframework.domain.model.dto.download.DownloadAssetResponse;
import lombok.Data;

import java.util.List;

@Data
public class AssetsDownloadResponse {
    private long totalCount;
    private List<DownloadAssetResponse> allAssetInfoList;
}