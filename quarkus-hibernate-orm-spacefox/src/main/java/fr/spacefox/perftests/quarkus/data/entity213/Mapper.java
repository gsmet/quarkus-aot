package fr.spacefox.perftests.quarkus.data.entity213;

import fr.spacefox.perftests.quarkus.core.service213.model.Model213;

final class Mapper {
    private Mapper() {}

    public static Model213 of(Entity213 entity) {
        return new Model213(entity.getId(), entity.getField());
    }
}
