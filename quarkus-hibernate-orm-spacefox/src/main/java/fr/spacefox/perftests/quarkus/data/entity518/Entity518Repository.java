package fr.spacefox.perftests.quarkus.data.entity518;

import fr.spacefox.perftests.quarkus.core.port.data.Entity518DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service518.model.Model518;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity518Repository implements Entity518DatasourcePort, PanacheRepository<Entity518> {
    @Override
    public Optional<Model518> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
