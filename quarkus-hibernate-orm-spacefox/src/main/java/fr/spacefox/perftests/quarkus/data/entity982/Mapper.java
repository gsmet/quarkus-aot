package fr.spacefox.perftests.quarkus.data.entity982;

import fr.spacefox.perftests.quarkus.core.service982.model.Model982;

final class Mapper {
    private Mapper() {}

    public static Model982 of(Entity982 entity) {
        return new Model982(entity.getId(), entity.getField());
    }
}
