package fr.spacefox.perftests.quarkus.data.entity273;

import fr.spacefox.perftests.quarkus.core.port.data.Entity273DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service273.model.Model273;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity273Repository implements Entity273DatasourcePort, PanacheRepository<Entity273> {
    @Override
    public Optional<Model273> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
