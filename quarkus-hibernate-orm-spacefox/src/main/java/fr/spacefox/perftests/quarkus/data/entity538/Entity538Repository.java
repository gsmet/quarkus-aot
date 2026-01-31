package fr.spacefox.perftests.quarkus.data.entity538;

import fr.spacefox.perftests.quarkus.core.port.data.Entity538DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service538.model.Model538;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity538Repository implements Entity538DatasourcePort, PanacheRepository<Entity538> {
    @Override
    public Optional<Model538> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
