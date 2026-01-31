package fr.spacefox.perftests.quarkus.data.entity743;

import fr.spacefox.perftests.quarkus.core.port.data.Entity743DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service743.model.Model743;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity743Repository implements Entity743DatasourcePort, PanacheRepository<Entity743> {
    @Override
    public Optional<Model743> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
