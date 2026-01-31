package fr.spacefox.perftests.quarkus.data.entity397;

import fr.spacefox.perftests.quarkus.core.service397.model.Model397;

final class Mapper {
    private Mapper() {}

    public static Model397 of(Entity397 entity) {
        return new Model397(entity.getId(), entity.getField());
    }
}
