package fr.spacefox.perftests.quarkus.data.entity580;

import fr.spacefox.perftests.quarkus.core.service580.model.Model580;

final class Mapper {
    private Mapper() {}

    public static Model580 of(Entity580 entity) {
        return new Model580(entity.getId(), entity.getField());
    }
}
