package fr.spacefox.perftests.quarkus.data.entity418;

import fr.spacefox.perftests.quarkus.core.port.data.Entity418DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service418.model.Model418;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity418Repository implements Entity418DatasourcePort, PanacheRepository<Entity418> {
    @Override
    public Optional<Model418> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
