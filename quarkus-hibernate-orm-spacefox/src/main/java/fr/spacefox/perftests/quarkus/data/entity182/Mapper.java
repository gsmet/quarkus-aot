package fr.spacefox.perftests.quarkus.data.entity182;

import fr.spacefox.perftests.quarkus.core.service182.model.Model182;

final class Mapper {
    private Mapper() {}

    public static Model182 of(Entity182 entity) {
        return new Model182(entity.getId(), entity.getField());
    }
}
