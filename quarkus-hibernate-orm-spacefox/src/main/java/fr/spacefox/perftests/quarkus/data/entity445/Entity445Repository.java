package fr.spacefox.perftests.quarkus.data.entity445;

import fr.spacefox.perftests.quarkus.core.port.data.Entity445DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service445.model.Model445;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity445Repository implements Entity445DatasourcePort, PanacheRepository<Entity445> {
    @Override
    public Optional<Model445> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
