package fr.spacefox.perftests.quarkus.core.service285;

import fr.spacefox.perftests.quarkus.core.port.data.Entity285DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service285.model.Model285;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service285 {

    private final Entity285DatasourcePort datasource;

    public Service285(Entity285DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model285 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
