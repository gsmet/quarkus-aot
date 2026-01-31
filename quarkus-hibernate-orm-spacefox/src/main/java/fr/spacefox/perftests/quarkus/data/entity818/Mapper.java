package fr.spacefox.perftests.quarkus.data.entity818;

import fr.spacefox.perftests.quarkus.core.service818.model.Model818;

final class Mapper {
    private Mapper() {}

    public static Model818 of(Entity818 entity) {
        return new Model818(entity.getId(), entity.getField());
    }
}
