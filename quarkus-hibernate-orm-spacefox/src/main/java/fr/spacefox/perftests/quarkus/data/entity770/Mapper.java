package fr.spacefox.perftests.quarkus.data.entity770;

import fr.spacefox.perftests.quarkus.core.service770.model.Model770;

final class Mapper {
    private Mapper() {}

    public static Model770 of(Entity770 entity) {
        return new Model770(entity.getId(), entity.getField());
    }
}
