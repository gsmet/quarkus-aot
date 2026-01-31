package fr.spacefox.perftests.quarkus.core.service852;

import fr.spacefox.perftests.quarkus.core.port.data.Entity852DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service852.model.Model852;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service852 {

    private final Entity852DatasourcePort datasource;

    public Service852(Entity852DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model852 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
