package fr.spacefox.perftests.quarkus.data.entity535;

import fr.spacefox.perftests.quarkus.core.port.data.Entity535DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service535.model.Model535;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity535Repository implements Entity535DatasourcePort, PanacheRepository<Entity535> {
    @Override
    public Optional<Model535> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
