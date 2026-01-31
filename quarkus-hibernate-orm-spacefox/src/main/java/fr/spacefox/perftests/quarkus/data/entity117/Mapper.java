package fr.spacefox.perftests.quarkus.data.entity117;

import fr.spacefox.perftests.quarkus.core.service117.model.Model117;

final class Mapper {
    private Mapper() {}

    public static Model117 of(Entity117 entity) {
        return new Model117(entity.getId(), entity.getField());
    }
}
