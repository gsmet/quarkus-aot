package fr.spacefox.perftests.quarkus.data.entity434;

import fr.spacefox.perftests.quarkus.core.service434.model.Model434;

final class Mapper {
    private Mapper() {}

    public static Model434 of(Entity434 entity) {
        return new Model434(entity.getId(), entity.getField());
    }
}
