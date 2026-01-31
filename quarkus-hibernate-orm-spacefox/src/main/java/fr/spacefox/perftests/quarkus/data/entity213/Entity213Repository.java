package fr.spacefox.perftests.quarkus.data.entity213;

import fr.spacefox.perftests.quarkus.core.port.data.Entity213DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service213.model.Model213;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity213Repository implements Entity213DatasourcePort, PanacheRepository<Entity213> {
    @Override
    public Optional<Model213> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
