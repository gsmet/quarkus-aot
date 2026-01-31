package fr.spacefox.perftests.quarkus.core.service212;

import fr.spacefox.perftests.quarkus.core.port.data.Entity212DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service212.model.Model212;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service212 {

    private final Entity212DatasourcePort datasource;

    public Service212(Entity212DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model212 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
