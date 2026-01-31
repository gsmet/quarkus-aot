package fr.spacefox.perftests.quarkus.data.entity609;

import fr.spacefox.perftests.quarkus.core.port.data.Entity609DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service609.model.Model609;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity609Repository implements Entity609DatasourcePort, PanacheRepository<Entity609> {
    @Override
    public Optional<Model609> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
