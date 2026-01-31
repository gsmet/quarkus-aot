package fr.spacefox.perftests.quarkus.data.entity685;

import fr.spacefox.perftests.quarkus.core.port.data.Entity685DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service685.model.Model685;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity685Repository implements Entity685DatasourcePort, PanacheRepository<Entity685> {
    @Override
    public Optional<Model685> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
