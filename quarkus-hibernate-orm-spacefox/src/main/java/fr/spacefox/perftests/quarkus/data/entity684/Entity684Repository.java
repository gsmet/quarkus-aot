package fr.spacefox.perftests.quarkus.data.entity684;

import fr.spacefox.perftests.quarkus.core.port.data.Entity684DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service684.model.Model684;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity684Repository implements Entity684DatasourcePort, PanacheRepository<Entity684> {
    @Override
    public Optional<Model684> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
