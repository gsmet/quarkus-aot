package fr.spacefox.perftests.quarkus.data.entity140;

import fr.spacefox.perftests.quarkus.core.service140.model.Model140;

final class Mapper {
    private Mapper() {}

    public static Model140 of(Entity140 entity) {
        return new Model140(entity.getId(), entity.getField());
    }
}
