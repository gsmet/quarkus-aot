package fr.spacefox.perftests.quarkus.data.entity105;

import fr.spacefox.perftests.quarkus.core.port.data.Entity105DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service105.model.Model105;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity105Repository implements Entity105DatasourcePort, PanacheRepository<Entity105> {
    @Override
    public Optional<Model105> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
