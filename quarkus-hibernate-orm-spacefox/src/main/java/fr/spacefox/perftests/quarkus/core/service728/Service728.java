package fr.spacefox.perftests.quarkus.core.service728;

import fr.spacefox.perftests.quarkus.core.port.data.Entity728DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service728.model.Model728;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service728 {

    private final Entity728DatasourcePort datasource;

    public Service728(Entity728DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model728 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
