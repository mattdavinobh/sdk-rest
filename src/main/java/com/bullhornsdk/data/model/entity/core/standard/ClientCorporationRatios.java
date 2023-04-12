package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.math.BigDecimal;
import java.util.Objects;

@JsonRootName("data")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClientCorporationRatios extends AbstractEntity implements QueryEntity {
    private Integer id;
    private ClientCorporation clientCorporation;
    private BigDecimal overallFillRatio;
    private BigDecimal overallInterviewToPlacementRatio;
    private BigDecimal overallSubmissionToInterviewRatio;
    private BigDecimal ytdFillRatio;
    private BigDecimal ytdInterviewToPlacementRatio;
    private BigDecimal ytdSubmissionToInterviewRatio;

    public ClientCorporationRatios() {
    }

    public Integer getId() {
        return this.id;
    }

    public ClientCorporation getClientCorporation() {
        return this.clientCorporation;
    }

    public BigDecimal getOverallFillRatio() {
        return this.overallFillRatio;
    }

    public BigDecimal getOverallInterviewToPlacementRatio() {
        return this.overallInterviewToPlacementRatio;
    }

    public BigDecimal getOverallSubmissionToInterviewRatio() {
        return this.overallSubmissionToInterviewRatio;
    }

    public BigDecimal getYtdFillRatio() {
        return this.ytdFillRatio;
    }

    public BigDecimal getYtdInterviewToPlacementRatio() {
        return this.ytdInterviewToPlacementRatio;
    }

    public BigDecimal getYtdSubmissionToInterviewRatio() {
        return this.ytdSubmissionToInterviewRatio;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setClientCorporation(ClientCorporation clientCorporation) {
        this.clientCorporation = clientCorporation;
    }

    public void setOverallFillRatio(BigDecimal overallFillRatio) {
        this.overallFillRatio = overallFillRatio;
    }

    public void setOverallInterviewToPlacementRatio(BigDecimal overallInterviewToPlacementRatio) {
        this.overallInterviewToPlacementRatio = overallInterviewToPlacementRatio;
    }

    public void setOverallSubmissionToInterviewRatio(BigDecimal overallSubmissionToInterviewRatio) {
        this.overallSubmissionToInterviewRatio = overallSubmissionToInterviewRatio;
    }

    public void setYtdFillRatio(BigDecimal ytdFillRatio) {
        this.ytdFillRatio = ytdFillRatio;
    }

    public void setYtdInterviewToPlacementRatio(BigDecimal ytdInterviewToPlacementRatio) {
        this.ytdInterviewToPlacementRatio = ytdInterviewToPlacementRatio;
    }

    public void setYtdSubmissionToInterviewRatio(BigDecimal ytdSubmissionToInterviewRatio) {
        this.ytdSubmissionToInterviewRatio = ytdSubmissionToInterviewRatio;
    }

    public String toString() {
        return "ClientCorporationRatios(id=" + this.getId() + ", clientCorporation=" + this.getClientCorporation() + ", overallFillRatio=" + this.getOverallFillRatio() + ", overallInterviewToPlacementRatio=" + this.getOverallInterviewToPlacementRatio() + ", overallSubmissionToInterviewRatio=" + this.getOverallSubmissionToInterviewRatio() + ", ytdFillRatio=" + this.getYtdFillRatio() + ", ytdInterviewToPlacementRatio=" + this.getYtdInterviewToPlacementRatio() + ", ytdSubmissionToInterviewRatio=" + this.getYtdSubmissionToInterviewRatio() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientCorporationRatios that = (ClientCorporationRatios) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(clientCorporation, that.clientCorporation))
            return false;
        if (!Objects.equals(overallFillRatio, that.overallFillRatio))
            return false;
        if (!Objects.equals(overallInterviewToPlacementRatio, that.overallInterviewToPlacementRatio))
            return false;
        if (!Objects.equals(overallSubmissionToInterviewRatio, that.overallSubmissionToInterviewRatio))
            return false;
        if (!Objects.equals(ytdFillRatio, that.ytdFillRatio)) return false;
        if (!Objects.equals(ytdInterviewToPlacementRatio, that.ytdInterviewToPlacementRatio))
            return false;
        return Objects.equals(ytdSubmissionToInterviewRatio, that.ytdSubmissionToInterviewRatio);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (clientCorporation != null ? clientCorporation.hashCode() : 0);
        result = 31 * result + (overallFillRatio != null ? overallFillRatio.hashCode() : 0);
        result = 31 * result + (overallInterviewToPlacementRatio != null ? overallInterviewToPlacementRatio.hashCode() : 0);
        result = 31 * result + (overallSubmissionToInterviewRatio != null ? overallSubmissionToInterviewRatio.hashCode() : 0);
        result = 31 * result + (ytdFillRatio != null ? ytdFillRatio.hashCode() : 0);
        result = 31 * result + (ytdInterviewToPlacementRatio != null ? ytdInterviewToPlacementRatio.hashCode() : 0);
        result = 31 * result + (ytdSubmissionToInterviewRatio != null ? ytdSubmissionToInterviewRatio.hashCode() : 0);
        return result;
    }
}
