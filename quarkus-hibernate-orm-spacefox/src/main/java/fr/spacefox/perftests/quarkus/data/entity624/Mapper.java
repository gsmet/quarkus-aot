package fr.spacefox.perftests.quarkus.data.entity624;

import fr.spacefox.perftests.quarkus.core.service624.model.Model624;

final class Mapper {
    private Mapper() {}

    public static Model624 of(Entity624 entity) {
        return new Model624(entity.getId(), entity.getField());
    }
}
