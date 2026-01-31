package fr.spacefox.perftests.quarkus.data.entity355;

import fr.spacefox.perftests.quarkus.core.port.data.Entity355DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service355.model.Model355;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity355Repository implements Entity355DatasourcePort, PanacheRepository<Entity355> {
    @Override
    public Optional<Model355> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
