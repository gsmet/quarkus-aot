package fr.spacefox.perftests.quarkus.data.entity900;

import fr.spacefox.perftests.quarkus.core.port.data.Entity900DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service900.model.Model900;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity900Repository implements Entity900DatasourcePort, PanacheRepository<Entity900> {
    @Override
    public Optional<Model900> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
