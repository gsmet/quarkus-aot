package fr.spacefox.perftests.quarkus.data.entity508;

import fr.spacefox.perftests.quarkus.core.service508.model.Model508;

final class Mapper {
    private Mapper() {}

    public static Model508 of(Entity508 entity) {
        return new Model508(entity.getId(), entity.getField());
    }
}
