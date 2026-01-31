package fr.spacefox.perftests.quarkus.data.entity598;

import fr.spacefox.perftests.quarkus.core.port.data.Entity598DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service598.model.Model598;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity598Repository implements Entity598DatasourcePort, PanacheRepository<Entity598> {
    @Override
    public Optional<Model598> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
