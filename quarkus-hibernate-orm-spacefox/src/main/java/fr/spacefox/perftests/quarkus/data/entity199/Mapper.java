package fr.spacefox.perftests.quarkus.data.entity199;

import fr.spacefox.perftests.quarkus.core.service199.model.Model199;

final class Mapper {
    private Mapper() {}

    public static Model199 of(Entity199 entity) {
        return new Model199(entity.getId(), entity.getField());
    }
}
