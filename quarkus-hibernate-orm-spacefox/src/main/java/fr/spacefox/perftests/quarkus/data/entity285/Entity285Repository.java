package fr.spacefox.perftests.quarkus.data.entity285;

import fr.spacefox.perftests.quarkus.core.port.data.Entity285DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service285.model.Model285;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity285Repository implements Entity285DatasourcePort, PanacheRepository<Entity285> {
    @Override
    public Optional<Model285> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
