package fr.spacefox.perftests.quarkus.core.service979;

import fr.spacefox.perftests.quarkus.core.port.data.Entity979DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service979.model.Model979;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service979 {

    private final Entity979DatasourcePort datasource;

    public Service979(Entity979DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model979 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
