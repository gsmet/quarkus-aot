package fr.spacefox.perftests.quarkus.data.entity443;

import fr.spacefox.perftests.quarkus.core.service443.model.Model443;

final class Mapper {
    private Mapper() {}

    public static Model443 of(Entity443 entity) {
        return new Model443(entity.getId(), entity.getField());
    }
}
