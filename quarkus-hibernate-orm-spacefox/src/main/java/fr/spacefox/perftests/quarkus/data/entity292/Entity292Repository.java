package fr.spacefox.perftests.quarkus.data.entity292;

import fr.spacefox.perftests.quarkus.core.port.data.Entity292DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service292.model.Model292;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity292Repository implements Entity292DatasourcePort, PanacheRepository<Entity292> {
    @Override
    public Optional<Model292> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
