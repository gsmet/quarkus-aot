package fr.spacefox.perftests.quarkus.data.entity781;

import fr.spacefox.perftests.quarkus.core.service781.model.Model781;

final class Mapper {
    private Mapper() {}

    public static Model781 of(Entity781 entity) {
        return new Model781(entity.getId(), entity.getField());
    }
}
