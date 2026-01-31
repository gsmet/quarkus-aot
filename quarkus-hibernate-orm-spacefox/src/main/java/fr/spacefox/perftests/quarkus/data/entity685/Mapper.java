package fr.spacefox.perftests.quarkus.data.entity685;

import fr.spacefox.perftests.quarkus.core.service685.model.Model685;

final class Mapper {
    private Mapper() {}

    public static Model685 of(Entity685 entity) {
        return new Model685(entity.getId(), entity.getField());
    }
}
