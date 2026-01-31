package fr.spacefox.perftests.quarkus.data.entity44;

import fr.spacefox.perftests.quarkus.core.port.data.Entity44DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service44.model.Model44;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity44Repository implements Entity44DatasourcePort, PanacheRepository<Entity44> {
    @Override
    public Optional<Model44> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
