package fr.spacefox.perftests.quarkus.data.entity181;

import fr.spacefox.perftests.quarkus.core.service181.model.Model181;

final class Mapper {
    private Mapper() {}

    public static Model181 of(Entity181 entity) {
        return new Model181(entity.getId(), entity.getField());
    }
}
