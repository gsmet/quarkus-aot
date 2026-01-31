package fr.spacefox.perftests.quarkus.data.entity869;

import fr.spacefox.perftests.quarkus.core.port.data.Entity869DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service869.model.Model869;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity869Repository implements Entity869DatasourcePort, PanacheRepository<Entity869> {
    @Override
    public Optional<Model869> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
