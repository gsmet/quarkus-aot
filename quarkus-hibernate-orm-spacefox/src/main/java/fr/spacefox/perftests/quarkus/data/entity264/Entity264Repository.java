package fr.spacefox.perftests.quarkus.data.entity264;

import fr.spacefox.perftests.quarkus.core.port.data.Entity264DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service264.model.Model264;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity264Repository implements Entity264DatasourcePort, PanacheRepository<Entity264> {
    @Override
    public Optional<Model264> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
