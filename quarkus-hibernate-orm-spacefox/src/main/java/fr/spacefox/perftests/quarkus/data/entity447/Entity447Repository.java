package fr.spacefox.perftests.quarkus.data.entity447;

import fr.spacefox.perftests.quarkus.core.port.data.Entity447DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service447.model.Model447;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity447Repository implements Entity447DatasourcePort, PanacheRepository<Entity447> {
    @Override
    public Optional<Model447> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
