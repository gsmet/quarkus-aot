package fr.spacefox.perftests.quarkus.data.entity720;

import fr.spacefox.perftests.quarkus.core.port.data.Entity720DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service720.model.Model720;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity720Repository implements Entity720DatasourcePort, PanacheRepository<Entity720> {
    @Override
    public Optional<Model720> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
