package fr.spacefox.perftests.quarkus.data.entity901;

import fr.spacefox.perftests.quarkus.core.service901.model.Model901;

final class Mapper {
    private Mapper() {}

    public static Model901 of(Entity901 entity) {
        return new Model901(entity.getId(), entity.getField());
    }
}
