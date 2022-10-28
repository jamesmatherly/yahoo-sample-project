package com.jamesmatherly.sample.project.model;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuoteSummary {
    List<Map<String, FinancialData>> result;
    String error;
}