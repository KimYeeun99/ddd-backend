package com.example.dddbackend.exampledomain.domain;

import java.util.List;

public record Example(String id, String name, List<SubExample> subExamples) {
}
