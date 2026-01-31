package fr.spacefox.perftests.quarkus.data.entity728;

import fr.spacefox.perftests.quarkus.core.port.data.Entity728DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service728.model.Model728;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity728Repository implements Entity728DatasourcePort, PanacheRepository<Entity728> {
    @Override
    public Optional<Model728> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
