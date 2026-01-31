package fr.spacefox.perftests.quarkus.data.entity601;

import fr.spacefox.perftests.quarkus.core.port.data.Entity601DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service601.model.Model601;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity601Repository implements Entity601DatasourcePort, PanacheRepository<Entity601> {
    @Override
    public Optional<Model601> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
